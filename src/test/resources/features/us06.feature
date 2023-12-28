@US06
Feature: US_06  Kullanıcı Ücret Hesapla pop-up ındaki yurt dışı ücret hesabını yapabilmeli.

  @Background:

  Given Kullanici aras kargo sayfa url'ine gider.
    When Kullanici ekrandaki ucreti hesapla butonuna tiklar
    Then Kullanici acilan sayfada yurtdisi sekmesine tiklar.
    Then Kullanici nereye(ülke) dropdownına tiklar ve random bir ülke secer.



  @US06_TC01
  Scenario:Kullanıcı yurtdisi icin Dosya / Evrak ucretini hesaplayabilmeli

    And Kullanici dosya/evrak tiklar ve hizmet türünü seçer.
    And Kullanici gönderi detayından toplam ücretin görüntülendigini dogrular.

  @US06_TC02
  Scenario:Kullanıcı yurtdisi icin Kutu / Koli ucretini hesaplayabilmeli

    And Kullanici kutu/koli tiklar ve hizmet türünü seçer.
    And Kullanici Ağırlık , yükseklik , boy , en bilgilerini girer
    And Kullanici  Desi Kg Hesapla butonuna tiklar.
    And Kullanici gönderi detayından toplam ücretin görüntülendigini dogrular.

  @US06_TC03
  Scenario:Kullanıcı yurtdisi icin Yeni Hesaplama Yap butonu ile ardisik hesaplama yapabilmeli – Kutu /Koli

    And Kullanici kutu/koli tiklar ve hizmet türünü seçer.
    And Kullanici Ağırlık , yükseklik , boy , en bilgilerini girer
    And Kullanici  Desi Kg Hesapla butonuna tiklar.
    And Kullanici gönderi detayından toplam ücretin görüntülendigini dogrular.
    And Kullanici  Yeni Hesaplama Yap butonuna tiklar
    And Kullanici ilgili sayfada oldugunu dogrular
    Then Kullanici acilan sayfada yurtdisi sekmesine tiklar.
    Then Kullanici nereye(ülke) dropdownına tiklar ve random bir ülke secer.
    And Kullanici kutu/koli tiklar ve hizmet türünü seçer.
    And Kullanici Ağırlık , yükseklik , boy , en bilgilerini girer
    And Kullanici  Desi Kg Hesapla butonuna tiklar.
    And Kullanici gönderi detayından toplam ücretin görüntülendigini dogrular.


  @US06_TC04
  Scenario:Kullanıcı yurtdisi icin Yeni Hesaplama Yap butonu ile ardisik hesaplama yapabilmeli – Dosya / Evrak

    And Kullanici dosya/evrak tiklar ve hizmet türünü seçer.
    And Kullanici  Gonderi Detayindan ucret goruntulendigini doğrular
    And Kullanici  Yeni Hesaplama Yap butonuna tiklar
    And Kullanici ilgili sayfada oldugunu dogrular
    Then Kullanici acilan sayfada yurtdisi sekmesine tiklar.
    Then Kullanici nereye(ülke) dropdownına tiklar ve random bir ülke secer.
    And Kullanici dosya/evrak tiklar ve hizmet türünü seçer.
    And Kullanici  Gonderi Detayindan ucret goruntulendigini doğrular

  @US06_TC05
  Scenario:Kullanıcı yurtdisi icin Kutu / Koli ucretini hesaplayabilmeli - Negative Test

    And Kullanici kutu/koli tiklar ve hizmet türünü seçer.
    And Kullanici   AĞIRLIK olarak invalid deger, yükseklik, en ve boy olarak valid degerler girer
    And Kullanici   Desi Kg Hesapla butonuna tiklanır
    And Kullanici  Gonderi Detayindan ucret goruntulenmedigini doğrular

  @US06_TC06
  Scenario:Kullanıcı yurtdisi icin Kutu / Koli ucretini hesaplayabilmeli - Negative Test

    And Kullanici kutu/koli tiklar ve hizmet türünü seçer.
    And Kullanici   agırlık, yükseklik, en ve boy olarak invalid degerler girer
    And Kullanici   Desi Kg Hesapla butonuna tiklanır
    And Kullanici  Gonderi Detayindan ucret goruntulenmedigini doğrular

  @US06_TC07
  Scenario:Kullanıcı yurtdisi icin Kutu / Koli ucretini hesaplayabilmeli - Negative Test

    And Kullanici kutu/koli tiklar ve hizmet türünü seçer.
    And Kullanici   agırlık olarak valid, yükseklik, en ve boy olarak invalid degerler girer
    And Kullanici   Desi Kg Hesapla butonuna tiklanır
    And Kullanici  Gonderi Detayindan ucret goruntulenmedigini doğrular