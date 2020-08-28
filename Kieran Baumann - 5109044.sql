/*CREATE TABLES*/
CREATE TABLE Article (
	ArticleID int,
	primary key (ArticleID),
	ArticleName varchar2(50),
	SubmissionDate date,
	NumberofPages int,
	NumberofReferences int
);

CREATE TABLE Academic (
	AcademicID int,
	primary key (AcademicID),
	AcademicName varchar2(50)
);

CREATE TABLE Institution (
	InstitutionID int,
	InstitutionName varchar2(20),
	primary key (InstitutionID)
);

CREATE TABLE Affiliation (
	Academic_ID int,
	Institution_ID int,
	UpdateDate date,
	primary key(Academic_ID, Institution_ID),
	foreign key(Academic_ID) references Academic(AcademicID),
	foreign key(Institution_ID) references Institution(InstitutionID)
);

CREATE TABLE Review (
	Review_ID int,
	Academic int,
	Article_ID int,
	ReviewDate date,
	primary key(Academic, Article_ID),
	foreign key(Academic) references Academic(AcademicID),
	foreign key(Article_ID) references Article(ArticleID)
);

CREATE TABLE Authoring (
	Academic_ID int,
	Article_ID int,
	Authors varchar2(20),
	primary key(Academic_ID, Article_ID),
	foreign key(Academic_ID) references Academic(AcademicID),
	foreign key(Article_ID) references Article(ArticleID)
);

/*INSERT SCRIPTS*/
/*INSERT INTO Article Values ('Name', 'SubDate',NumberofPages,NumberofReferences),*/
INSERT INTO Article Values (1, 'Article1', '20-OCT-2018', 210,1);
INSERT INTO Article Values (2, 'Article2', '12-JAN-2018', 123,2);
INSERT INTO Article Values (3, 'Article3', '15-JAN-2018', 101,1);
INSERT INTO Article Values (4, 'Article4', '01-FEB-2018', 142,0);
INSERT INTO Article Values (5, 'Article5', '21-FEB-2018', 140,4);
INSERT INTO Article Values (6, 'Article6', '23-FEB-2018', 120,4);
INSERT INTO Article Values (7, 'Article7', '10-MAR-2018', 200,1);
INSERT INTO Article Values (8, 'Article8', '22-MAR-2018', 210,4);

INSERT INTO Academic VALUES (1, 'Samual');
INSERT INTO Academic VALUES (2, 'Max');
INSERT INTO Academic VALUES (3, 'Kieran');
INSERT INTO Academic VALUES (4, 'Jack');
INSERT INTO Academic VALUES (5, 'Louis');

INSERT INTO Institution VALUES (1, 'Institution1');
INSERT INTO Institution VALUES (2, 'Institution2');
INSERT INTO Institution VALUES (3, 'Institution3');
INSERT INTO Institution VALUES (4, 'Institution4');
INSERT INTO Institution VALUES (5, 'Institution5');
INSERT INTO Institution VALUES (6, 'Institution6');
INSERT INTO Institution VALUES (7, 'Institution7');
INSERT INTO Institution VALUES (8, 'Institution8');

INSERT INTO Affiliation VALUES (1, 1, '12-JUN-2018');
INSERT INTO Affiliation VALUES (3, 1, '14-JUN-2018');
INSERT INTO Affiliation VALUES (2, 2, '24-JUN-2018');
INSERT INTO Affiliation VALUES (3, 3, '12-JUL-2018');
INSERT INTO Affiliation VALUES (4, 4, '24-OCT-2018');
INSERT INTO Affiliation VALUES (5, 5, '25-OCT-2018');

INSERT INTO Review VALUES (1, 1, 1, '13-JUL-2018');
INSERT INTO Review VALUES (2, 2, 2, '23-JUL-2018');
INSERT INTO Review VALUES (3, 3, 3, '12-AUG-2018');
INSERT INTO Review VALUES (4, 4, 4, '23-SEP-2018');
INSERT INTO Review VALUES (5, 5, 5, '24-NOV-2018');
INSERT INTO Review VALUES (6, 5, 3, '25-NOV-2018');
INSERT INTO Review VALUES (7, 4, 3, '26-NOV-2018');

INSERT INTO Authoring VALUES (1,1,'Samual');
INSERT INTO Authoring VAlUES (2,2,'Max');
INSERT INTO Authoring VALUES (3,3,'Kieran');
INSERT INTO Authoring VAlUES (4,4,'Kieran');
INSERT INTO Authoring VALUES (5,3,'Jack');
INSERT INTO Authoring VALUES (4,5,'Jack');
INSERT INTO Authoring VALUES (5,6,'Louis');
INSERT INTO Authoring VALUES (5,8,'Louis');


/*DROP SCRIPTS*/

DROP TABLE Authoring;
DROP TABLE Review;
DROP TABLE Affiliation;
DROP TABLE Institution;
DROP TABLE Academic;
DROP TABLE Article;

/*SELECT SCRIPTS*/

1 . SELECT * FROM academic;

2 . SELECT academicname, institutionname
	FROM academic, affiliation, institution
	WHERE academic.academicid=affiliation.academic_id
	and institution.institutionid = affiliation.institution_id
	and institution.institutionid=1

3 . SELECT institutionname, COUNT(academic.academicid) AS TotalAcademics
	from institution, affiliation, academic
	where academic.academicid = affiliation.academic_id
	and affiliation.institution_id = affiliation.academic_id
	group by institution.institutionname
	
	
4 . SELECT distinct  academic.academicid, institution_id, institutionname totalreviews
	from academic, affiliation, institution,
    (
    SELECT academicid ,count(review_id) as TotalReviews
    FROM academic, review
    where academic.academicid = review.academic
    group by academicid
    )CountReviews,
    (
    SELECT max(updatedate) as MostRecentDate
    from affiliation, academic
    where academic.academicid = affiliation.academic_id
    group by academic.academicid
    )RecentDate
    where countreviews.academicid = academic.academicid
    and affiliation.academic_id = academic.academicid
    and recentdate.MostRecentDate = affiliation.updatedate
    and institution.institutionid = affiliation.institution_id
    order by totalreviews DESC
    



