describe("Operation Testing",()=> {
    

        it("Addition Testing ",()=> {
                let result = add(10,20);
                expect(30).toEqual(result);
        })

        it("Substration Testing ",()=> {
            let result = sub(100,50);
            expect(50).toEqual(result);
        })

})