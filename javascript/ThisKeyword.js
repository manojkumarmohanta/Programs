const manoj = {
    name: "manoj kumar",
    qualification: "MCA",
    age : 25,
    game: function(){
        console.log("Playing Cricket");
        console.log(this.name)
    }
}

manoj.game();

