// it can be interface or class which help to map the json 
// data retreive from backend technologies. 
export interface Product {
    id:number;
    title:string;
    price:number;
    description:string;
    category:string;
    image:string;
    rating:Rating
}
interface Rating {
    rate:number;
    count:number;
}

/*
export class Product {
    constructor(public id:number,public title:string.....................){}
}
*/
