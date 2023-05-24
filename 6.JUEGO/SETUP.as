package  {
	
	import flash.display.MovieClip;
	
	
	public class SETUP extends MovieClip { //definicion de la clase 
		//clase constructora
		private var FONDO_new: FONDO = new FONDO(); //variables de clase 
		private var PISO_new: PISO = new PISO();
		private var ANTAGONISTA_new: ANTAGONISTA = new ANTAGONISTA();
		private var PROTA_new: PROTA = new PROTA();
		
		public function SETUP() { //metodo constructor 
			// constructor code
			
			addChild (FONDO_new);
			FONDO_new.y=0;
			FONDO_new.x=0;
			
			addChild (PISO_new);
			PISO_new.y=350;
			PISO_new.x=0;
			
			addChild (ANTAGONISTA_new);
			ANTAGONISTA_new.y=20;
			ANTAGONISTA_new.x=275;
			
			addChild (PROTA_new);
			PROTA_new.y=275;
			PROTA_new.x=20;
		}
	}
	
}
