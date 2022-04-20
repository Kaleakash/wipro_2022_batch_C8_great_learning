function add(a, b) {
    console.log("called..");
}
add(1, 2);
add(10.10, 20.20);
add("Ravi", "Kumar");
//add(2);
//add();
function empInfo(id, name, age) {
    console.log(id + " " + name + " " + age);
}
empInfo(1, "Ravi", 21);
empInfo(1, "Ramu", 22);
function dis1() {
    return "Welcome";
}
function dis2() {
    return 100;
}
function dis3() {
    return true;
}
function dis4() {
    //return 100;
}
function dis5() {
}
function dis6() {
    //return 100;
    //return "Welcome"
}
// optional parameter 
// function stdInfo(id:number,name?:string,age?:number): void {
//         console.log(id+" "+name+" "+age)
// }
// stdInfo(1,"Ravi");
// stdInfo(2,"Ramesh",21);
// stdInfo(3)
// default initialization 
function stdInfo(id, name, age) {
    if (id === void 0) { id = 0; }
    if (name === void 0) { name = "Unkown"; }
    if (age === void 0) { age = 18; }
    console.log(id + " " + name + " " + age);
}
stdInfo(1, "Ravi");
stdInfo(2, "Ramesh", 21);
stdInfo(3);
