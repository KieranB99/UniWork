import discord
import datetime
import pprint
client = discord.Client()

@client.event
async def on_ready():
    print('We have logged in as {0.user}'.format(client))

def timeday():
  current_time = datetime.datetime.now()
  return current_time

def timetable(day):
  Sunday={
    "02:00 AM": "Karanda",
    "11:00 AM": "Kzarka,Nouver",
    "16:00 PM": "Karanda,Kutum",
    "20:00 PM": "Nouver,Kutum",
    "23:00 PM": "Karanda"
  }
  Monday={
    "02:00 AM" : "Kzarka",
    "11:00 AM" : "Kzarka,Nouver",
    "16:00 PM" : "Kzarka,Kutum",
    "20:00 PM" : "Karanda,Nouver"
  }
  Tuesday={
    "02:00 AM" : "Kzarka",
    "11:00 AM" : "Kzarka,Kutum",
    "16:00 PM" : "Kzarka,Nouver",
    "20:00 PM" : "Karanda,Kutum"
  }
  Wednesday={
    "02:00 AM" : "Nouver",
    "11:00 AM" : "Nouver,Kutum",
    "16:00 PM" : "Kzara,Nouver",
    "20:00 PM" : "Karanda,Kzarka"
  }
  Thursday={
    "02:00 AM" : "Kutum",
    "11:00 AM" : "Kzarka,Nouver",
    "16:00 PM" : "Karanda,Kutum",
    "20:00 PM" : "Nouver,Kutum"
  }
  Friday={
    "02:00 AM" : "Karanda",
    "11:00 AM" : "Kzarka,Kutum",
    "16:00 PM" : "Karanda,Nouver",
    "20:00 PM" : "Kzarka,Kutum"
  }
  Saturday={
    "02:00 AM" : "Karanda",
    "11:00 AM" : "Nouver,Kutum",
    "16:00 PM" : "Karanda,Kzarka"
  }
  if day == "Sun":
    return Sunday
  if day == "Mon":
    return Monday
  if day == "Tue":
    return Tuesday
  if day == "Wed":
    return Wednesday
  if day == "Thu":
    return Thursday
  if day == "Fri":
    return Friday
  if day == "Sat":
    return Saturday
           

def table(day,time):
  time=int(time)
  if day == "Monday":
    values=[200, 1100, 1600, 2000]
    if time>values[3]:
      boss="Done For Today"
    else:
      nearest = min(values, key=lambda v: abs(time-v))
      if time>nearest:
        i=0
        for x in values:
          if x == nearest:
            nearest=values[i+1]
          else:
            i+=1
      if nearest == 200:
        boss="Kzarka"
      elif nearest == 1100:
        boss="Kzarka, Nouver"
      elif nearest == 1600:
        boss="Kzarka, Kutum"
      elif nearest == 2000: 
        boss="Karanda, Nouver"   
  elif day == "Tuesday":
    values=[200, 1100, 1600, 2000]
    if time>values[3]:
      boss="Done For Today"
    else:
      nearest = min(values, key=lambda v: abs(time-v))
      if time>nearest:
        i=0
        for x in values:
          if x == nearest:
            nearest=values[i+1]
          else:
            i+=1
      if nearest == 200:
        boss="Kzarka"
      elif nearest == 1100:
        boss="Kzarka, Kutum"
      elif nearest == 1600:
        boss="Kzarka, Nouver"
      elif nearest == 2000: 
        boss="Karanda, Kutum" 
  elif day == "Wednesday":
    values=[200, 1100, 1600, 2000]
    if time>values[3]:
      boss="Done For Today"
    else:
      nearest = min(values, key=lambda v: abs(time-v))
      if time>nearest:
        i=0
        for x in values:
          if x == nearest:
            nearest=values[i+1]
          else:
            i+=1
      if nearest == 200:
        boss="Nouver"
      elif nearest == 1100:
        boss="Kutum, Nouver"
      elif nearest == 1600:
        boss="Kzarka, Nouver"
      elif nearest == 2000: 
        boss="Karanda, Kzarka" 
  elif day == "Thursday":
    values=[200, 1100, 1600, 2000]
    if time>values[3]:
      boss="Done For Today"
    else:
      nearest = min(values, key=lambda v: abs(time-v))
      if time>nearest:
        i=0
        for x in values:
          if x == nearest:
            nearest=values[i+1]
          else:
            i+=1
      
      if nearest == 200:
        boss="Kutum"
      elif nearest == 1100:
        boss="Kzarka, Nouver"
      elif nearest == 1600:
        boss="Karanda, Kutum"
      elif nearest == 2000: 
        boss="Nouver, Kutum" 
  elif day == "Friday":
    values=[200, 1100, 1600, 2000]
    if time>values[3]:
      boss="Done For Today"
    else:
      nearest = min(values, key=lambda v: abs(time-v))
      if time>nearest:
        i=0
        for x in values:
          if x == nearest:
            nearest=values[i+1]
          else:
            i+=1
      if nearest == 200:
        boss="Karanda"
      elif nearest == 1100:
        boss="Kzarka, Kutum"
      elif nearest == 1600:
        boss="Karanda, Nouver"
      elif nearest == 2000: 
        boss="Kzarka, Kutum" 
  elif day == "Saturday":
    values=[200, 1100, 1600]
    if time>values[2]:
      boss="Done For Today"
    else:
      nearest = min(values, key=lambda v: abs(time-v))
      if time>nearest:
        i=0
        for x in values:
          if x == nearest:
            nearest=values[i+1]
          else:
            i+=1
      if nearest == 200:
        boss="Karanda"
      elif nearest == 1100:
        boss="Nouver, Kutum"
      elif nearest == 1600:
        boss="Karanda, Kazrka"
      
  elif day == "Sunday":
    values[200, 1100, 1600, 2000, 2300]
    if time>values[4]:
      boss="Done For Today"
    else:
      nearest = min(values, key=lambda v: abs(time-v))
      if time>nearest:
        i=0
        for x in values:
          if x == nearest:
            nearest=values[i+1]
          else:
            i+=1
      if nearest == 200:
        boss="Karanda"
      elif nearest == 1100:
        boss="Kzarka, Nouver"
      elif nearest == 1600:
        boss="Karanda, Kutum"
      elif nearest == 2000: 
        boss="Nouver, Kutum"
      elif nearest == 2300: 
        boss="Karanda"
  return boss,nearest
  
def weekday(weekday):
      if weekday==0:
        day="Monday"
      elif weekday==1:
        day="Tuesday"
      elif weekday==2:
        day="Wednesday"
      elif weekday==3:
        day="Thursday"
      elif weekday==4:
        day="Friday"
      elif weekday==5:
        day="Saturday"
      elif weekday==6:
        day="Sunday"
      return day
@client.event
async def on_message(message):
    if message.author == client.user:
        return
    if message.content.startswith('$nextboss'):
        current_time=timeday()
        current_hour = current_time.hour
        current_weekday= current_time.weekday()
        current_minute = str(current_time.minute)
        if current_minute == 0 or current_minute == 1 or current_minute == 2  or current_minute == 3 or current_minute == 4 or current_minute == 5 or current_minute == 6 or current_minute == 7 or current_minute == 8 or current_minute == 9:
          current_minute="0"+current_minute
        current_time=str(current_hour) +  current_minute
        day=weekday(current_weekday)
        result,time=table(day,current_time)
        time=str(time)
        bossh=time[0:2]
        bossm=time[3:4]
        
        bh=int(bossh)-current_hour
        
        bm=int(bossm)-int(current_minute)
        bm=bm*-1
        bm=60-bm

        result=result+str(bh)+" h"+str(bm)+" m"+" Left"
        await message.channel.send(result)
        
    if message.content.startswith('$day'):
        current_time=timeday()
        d = timeday().strftime("%a") # day abr (mon,tue,wed)
        x = timetable(d)
        day = "Bosses for today:"
        y = str(x).replace("{","").replace("}","").replace(", ","\n").replace("'","")
        dayy = str(day) + "\n" + str(y)
        
        await message.channel.send(dayy)
        #def weekday
        


      

client.run('')