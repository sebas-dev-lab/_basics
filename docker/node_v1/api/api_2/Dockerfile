FROM node:latest
RUN mkdir /api_2
RUN cd api_2
RUN mkdir /src
RUN npm install nodemon -g
WORKDIR /api_2/src
ADD package.json /api_2/src/package.json
RUN npm install
ADD nodemon.json /api_2/src/nodemon.json
EXPOSE 3002
CMD nodemon index.js

