const express = require("express");

const app = express();

app.use(express.json());

app.use("/", (req, res) => {
  res.send({ msj: "apiV2" });
});

app.listen(3002, () => {
  console.log("apiV2");
});
