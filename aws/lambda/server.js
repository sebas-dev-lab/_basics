const express = require("express");
const cors = require("cors");
const morgan = require("morgan");
const User = require("./models/User");
const server = express();

server.use(cors());
server.use(morgan("dev"));
server.use(express.json());
server.use(express.urlencoded({ extended: false }));

require("./db");
server.get("/", async (req, res) => {
//   res.send({ msj: "entro" });
  let users = await User.find();
  res.status(200).send({ message: "Usuarios", users: JSON.stringify(users) });
});

server.get("/api/info", async (req, res) => {
  let users = await User.find();
  res.status(200).send({ message: "Usuarios", users: JSON.stringify(users) });
});

// server.listen(3000, ()=>console.log('server listen on port 3000'))

module.exports = server;
