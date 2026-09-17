public class CreadorObjeto {
public static void main(String [] arg)  {

  MascotaVirtual [] refugio={
    new Perro (" coco"),
    new Gato (" blaze"),
    new Perro (" layka"),
    new Pollito (" sasha")

  };
  for (MascotaVirtual m : refugio){ 
    m.hacerSonido();
    m.mostrarEstado();
    m.dibujar();
  }


  
}
}