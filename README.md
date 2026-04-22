# Task Management Area System - Backend (API)

Bu proje, Görev Bölgesi Yönetim Sistemi'nin veri yönetimini, iş mantığını (Business Logic) ve coğrafi hesaplamalarını üstlenen Spring Boot tabanlı RESTful API servisidir.

## ⚙️ Teknik Yetenekler
- **Coğrafi Veri İşleme:** Birimlerin hareket verilerinden kümülatif mesafe hesaplama (Haversine Algorithm).
- **Mekansal Sorgulama:** PostgreSQL ve PostGIS entegrasyonu ile ileri seviye konum bazlı veri yönetimi.
- **Performans Optimizasyonu:** Büyük veri setleri üzerinde SQL Pencere Fonksiyonları (Window Functions - LAG, SUM OVER) ile hızlı analitik raporlama.
- **Zaman Serisi Analizi:** Birimlerin tarih bazlı hareket geçmişinin takibi ve gruplandırılması (Java Stream API & groupingBy).

## 🛠 Teknoloji Yığını
- **Framework:** Java Spring Boot 3.x
- **Veritabanı:** PostgreSQL / PostGIS
- **Veri Erişimi:** Spring Data JPA (Hibernate)
- **Araçlar:** Maven, Lombok

## 📦 Kurulum ve Yapılandırma
1. **Veritabanı:** `application.properties` dosyasında PostgreSQL bağlantı bilgilerinizi güncelleyin.
   2. **Derleme:** ```bash
   mvn clean install
   mvn spring-boot:run