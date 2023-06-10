          package exercice.simplicitePire ;                import java.util.List;
          import/**/java.util.             ArrayList;public/*a*/class 
          SimplicitePire2{public static           List/***/<String> solution(
          String s,List<Character        >o){List<String>r=new ArrayList
            <String  >();ArrayList      <String> lm=  ( new     ArrayList
            <String  >());String ad    ="";for(int i  =0 ;i    <=s.length
            ();i++)  {if(i== s.length()) {lm.add(ad)  ;} else if (  s.
            charAt(  i)==' ') {lm.add(ad) ; ad=""; }  else {ad+=s.
            charAt(  i);}}for  (int i=0;i   <o.size(  );i++){for(int j
=0;j<lm.    size();  j++){if(   o.get(i)    ==lm.get  (j).       charAt(0)
){r.add(   lm.get(j  )) ; lm.    remove     (j);}}}   for        (int i=0;
i<lm.size ();i=i+1)  {if (lm.               get( i)!=null){r.add(lm .get
  (i));}}return(r)   ;}public               static void useless(){System.
   out.println()     ;System.               out.println("Et voilà!");
    System.out.      println(               "Fin du programme");}}

/*
     * Préléminaire :
     * La nomenclature est respectée.
     * Suspicion de chatGPT notamment à cause de la forme globale du code et peut être aussi à cause de la syntaxe Java utilisée (mais pas sûr).
     * 
     * Simplicité :
     * En termes de simplicité, cette implémentation ne correspond pas du tout à mes attentes. La fonction manque de commentaires pour faciliter la compréhension et la modification du code. De plus, la syntaxe Java utilisée est complexe.
     * Le nom des variables n'est pas explicite. Il faut comprendre le code pour comprendre le rôle de chaque variable mais comme on a du mal à comprendre le code à cause de la syntaxe et du manque de commentaires, cela devient compliqué.
     * Les indentations ne sont pas respectées du tout ce qui rend le code difficile à lire et à comprend aussi.
     * Il est très (très) difficile de comprendre le code d'où le fait qu'il soit en simplicité pire. Félicitations à celui qui a réussi à le faire c'est un 10/10 pour l'instant car il respecte bien la simplicité pire.
     * 
     * Tests :
     * Il ne passe que 1 tests sur 4 fournis.
     * - le premier, il a pas une bonne découpe avec la " , "
     * - le troisième avec la chaines vide, il a un index out of range
     * - le quatrième, il a pas une bonne découpe avec la " ' "
     * 
     * Parmi les tests supplémentaires :
     * - assertEquals(List.of("Bonjour", "le", "monde", "!", "Comment", "ça", "va", "?"), exercice.simplicite.SimpliciteMeilleur.solution("Bonjour le monde! Comment ça va?", List.of("B", "l", "m", "C", "v")));
     * - assertEquals(List.of("abc", "def", "ghi", "jkl"), exercice.simplicite.SimpliciteMeilleur.solution("abc@def#ghi$jkl", List.of("a", "d", "g", "j")));
     * 
     * Il ne passe pas le premier test supplémentaire car il ne prend pas en compte les mots spéciaux (ici "!" et "?") dans son split.
     * Il ne passe pas le second test supplémentaire car il ne prend pas en compte les caractères spéciaux (ici "@", "#" et "$") dans son split.
     * 
     * Note : 13/20
     * Détail :
     * - +0,5 car il correspond bien à la simplicité pire (lecture et compréhension du code très difficile) et en plus il y a l'effort de faire la forme globale du code (même si c'est surement chatGPT)
     * - -2 x3 car il ne passe que 1 test sur 4 fournis (dommage) donc -6
     * - -1 x2 car il ne passe aucun test supplémentaire donc -2
     * - +0,5 car le test supplémentaire est dur à passer (peut être même faux) => je saurais l'expliquer à l'oral
     */