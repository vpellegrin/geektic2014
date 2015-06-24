package com.ninja_squad.geektic.dao;

import com.ninja_squad.dbsetup.operation.Operation;

import static com.ninja_squad.dbsetup.Operations.deleteAllFrom;
import static com.ninja_squad.dbsetup.Operations.insertInto;
import static com.ninja_squad.dbsetup.operation.CompositeOperation.sequenceOf;

/**
 * Created by Valentin on 24/06/2015.
 */
public class CommonOperations {
    public static final Operation DELETE_ALL = deleteAllFrom("GEEKINTERET", "GEEK", "INTERET");

    public static final Operation INSERT_REFERENCE_DATA =
            sequenceOf(
                    insertInto("GEEK")
                            .columns("id", "nom", "prenom", "mail", "sexe", "photo", "description_courte", "description_longue")
                            .values(1, "DUPONT", "Jean", "jean.dupont@gmail.com", 'H', "jeandupont.png", "Salut Salut Salut courte", "Salut Salut Salut longue")
                            .values(2, "GOUNON", "Damien", "damien.gounon@gmail.com", 'H', "damiengounon.png", "Salut Salut Salut courte", "Salut Salut Salut longue")
                            .values(3, "SAPET", "Paul", "paul.sapet@gmail.com", 'H', "paulsapet.png", "Salut Salut Salut courte", "Salut Salut Salut longue")
                            .values(4, "ISOARDI", "Antoine", "antoine.isoardi@gmail.com", 'H', "antoineisoardi.png", "Salut Salut Salut courte", "Salut Salut Salut longue")
                            .values(5, "BERENGIER", "Adrien", "adrien.berengier@gmail.com", 'H', "adrienberengier.png", "Salut Salut Salut courte", "Salut Salut Salut longue")
                            .values(6, "BERENGIER", "Julien", "julien.berengier@gmail.com", 'H', "julienberengier.png", "Salut Salut Salut courte", "Salut Salut Salut longue")
                            .values(7, "ZOGBI", "Kael", "kael.zogbi@gmail.com", 'H', "kaelzogbi.png", "Salut Salut Salut courte", "Salut Salut Salut longue")
                            .values(8, "ZOGBI", "Anais", "anais.zogbi@gmail.com", 'F', "anaiszogbi.png", "Salut Salut Salut courte", "Salut Salut Salut longue")
                            .values(9, "COQUILLAUD", "Charlotte", "coquillaud.charlotte@gmail.com", 'F', "coquillaudcharlotte.png", "Salut Salut Salut courte", "Salut Salut Salut longue")
                            .build(),
                    insertInto("INTERET")
                            .columns("id", "libelle", "photo")
                            .values(1, "PHP", "php.png")
                            .values(2, "C#", "csharp.png")
                            .values(3, "JAVA", "java.png")
                            .values(4, "Angular", "angular.png")
                            .values(5, "TDD", "tdd.png")
                            .values(6, "MCD", "mcd.png")
                            .build(),
                    insertInto("GEEKINTERET")
                            .columns("id_geek", "id_interet")
                            .values(1, 2)
                            .values(1, 005)
                            .values(1, 6)
                            .values(2, 3)
                            .values(2, 6)
                            .values(2, 4)
                            .values(3, 4)
                            .values(3, 1)
                            .values(4, 3)
                            .values(4, 2)
                            .values (5, 2)
                            .values (5, 3)
                            .values (5, 6)
                            .values (6, 2)
                            .values (6, 5)
                            .values (6, 6)
                            .values (7, 3)
                            .values (7, 4)
                            .values (7, 5)
                            .values (8, 1)
                            .values (8, 4)
                            .values (9, 1)
                            .values (9, 4)
                            .values (9, 5)
                            .build());
}
