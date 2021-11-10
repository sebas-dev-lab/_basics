const mongoose = require("mongoose");

const uri = `mongodb+srv://wallet:fayser17@cluster0.f812g.mongodb.net/wallet?retryWrites=true&w=majority`;

mongoose.connect(uri)
