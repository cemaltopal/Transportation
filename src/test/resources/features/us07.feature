@us07
Feature: US_07 Kullanicinin En Yakin Subeler Pop-up ini Kullanmasi

  @Background:
  Given Kullanici urle gider
    When Acilan sayfada alertler varsa kapatir
    When Sayfada sol asagi kisinda bulunan en yakin subeler butonuna tiklar

  @Us07_Tc01
  Scenario: Kullanici en yakin subeler butonunu  tiklayabilmelidir.
    Then En yakin subeler butonunun tiklanabilir oldugunu dogrular

  @Us07_Tc02
  Scenario: Kullanici ona en yakin subeleri konum ozelligini kulanarak bulabilmelidir
    When Arama islemi seciniz okuna tiklar
    When Acilan dropdowndan subelerimizi secer
    When Konumla buldan arama yapar
    Then Kulanici konumuna en yakin subelerin listelendigini dogrular

  @Us07_Tc03
  Scenario: Kullanici istedigi konumdaki subeleri subelerimiz secenegi altinda bulunan il ilce secenegini doldurarak bulabilmelidr
    When Arama islemi seciniz okuna tiklar
    When Acilan dropdowndan subelerimizi secer
    When Il ilce seceneklerinden secim yaparak arama yapar
    Then Secilen il ilceye gore listelenme yapildigini dogrular

  @Us07_Tc04
  Scenario: Kullanici Aras burasi noktalarini  Esnaf modu secili iken konum ozelligini kullanarak  kendine en yakin olanlar seklinde bulabilmelidir
    When Arama islemi seciniz okuna tiklar
    When Acilan dropdowndan Aras burasi secenegini tiklar
    When Esnaf modunu secili hale getirir
    And Konumla aramayi secerek arama yapar
    Then Kullanici kendine en yakin Aras Burasi noktalarinin listelendigini dogrular

  @Us07_Tc05
  Scenario: Kullanici Aras burasi noktalarini  Esnaf modu secili iken il ilce kismini doldurarak   bulabilmelidir
    When Arama islemi seciniz okuna tiklar
    When Acilan dropdowndan Aras burasi secenegini tiklar
    When Esnaf modunu secili hale getirir
    And Il ilce seceneklerinden secim yaparak arama yapar
    Then Kullanici sectigi il ilceye gore Aras Burasi noktalarinin listelendigini dogrular

  @Us07_Tc06
  Scenario: Kullanici Aras burasi noktalarini Dolap modu secili iken konum ozelligi kullanarak kendine en yakin olanlar seklinde bulabilmelidir
    When Arama islemi seciniz okuna tiklar
    When Acilan dropdowndan Aras burasi secenegini tiklar
    When Dolap modunu secili hale getirir
    And Konumla aramayi secerek arama yapar
    Then Kullanici kendine en yakin Aras Burasi noktalarinin listelendigini dogrular

  @Us07_Tc07
  Scenario: Kullanici Aras burasi noktalarini Dolap modu secili iken il ilce doldurarak bulabilmelidir"
    When Arama islemi seciniz okuna tiklar
    When Acilan dropdowndan Aras burasi secenegini tiklar
    When Dolap modunu secili hale getirir
    And Il ilce seceneklerinden secim yaparak arama yapar
    Then Kullanici sectigi il ilceye gore Aras Burasi noktalarinin listelendigini dogrular

























