public class SheetFactory extends DocumentFactory{


        @Override
        public Document createDocument(){
            return new ExcelDocument();
        }
    }

