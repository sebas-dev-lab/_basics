const express = require("express");

const app = express();

app.use(express.json());

app.use("/", (req, res) => {
  res.send({ msj: "apiV1" });
});

app.listen(3001, () => {
  console.log("apiV1");
});
