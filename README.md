# Below are the environment variable which need to be configure in OS system environment variable

## Database
- host : DATABASE_HOST
- name : DATABASE_NAME
- port : DATABASE_PORT

## api url 

- url of api : API_URL

### executable jar file is added in the source code in the root folder 

### command to run jar
nohup java -jar race-0.0.1-SNAPSHOT.jar &

### command to stop jar
sudo pkill -9 -f race-0.0.1-SNAPSHOT.jar