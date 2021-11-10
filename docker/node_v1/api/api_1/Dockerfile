FROM node:latest
RUN mkdir /api_1
RUN cd api_1
RUN mkdir /src
RUN npm install nodemon -g
WORKDIR /api_1/src
ADD package.json /api_1/src/package.json
RUN npm install
ADD nodemon.json /api_1/src/nodemon.json
EXPOSE 3001
CMD nodemon index.js

