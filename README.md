[README.md](https://github.com/user-attachments/files/28183723/README.md)
<div align="center">

# 🌟 SilverConnect India

### *"Helping Experience Stay Valuable."*

**India's simplest and most trusted platform connecting retired professionals with startups, businesses, and students.**

[![Status](https://img.shields.io/badge/Status-MVP%20In%20Progress-e8921a?style=for-the-badge)](https://github.com)
[![Made for India](https://img.shields.io/badge/Made%20for-India%20🇮🇳-138808?style=for-the-badge)](https://github.com)
[![License](https://img.shields.io/badge/License-MIT-0d2240?style=for-the-badge)](LICENSE)
[![PRs Welcome](https://img.shields.io/badge/PRs-Welcome-27a65c?style=for-the-badge)](CONTRIBUTING.md)

<br/>

> **Connect. Mentor. Earn. Inspire.**
> Helping India's 2+ crore retired professionals stay financially active, respected, and connected — through simple, senior-friendly technology.

<br/>

[🚀 Live Demo](https://silver-mentor-connect--zukiiyoo.replit.app) · [📋 Report a Bug](https://github.com/issues) · [💡 Request a Feature](https://github.com/issues) · [💬 WhatsApp Us](https://wa.me/919876500001)

</div>

---

## 📌 Table of Contents

- [About the Project](#-about-the-project)
- [The Problem We Solve](#-the-problem-we-solve)
- [Key Features](#-key-features)
- [Screenshots](#-screenshots)
- [Tech Stack](#-tech-stack)
- [Getting Started](#-getting-started)
- [Project Structure](#-project-structure)
- [Database Schema](#-database-schema)
- [API Reference](#-api-reference)
- [Business Model](#-business-model)
- [Roadmap](#-roadmap)
- [Contributing](#-contributing)
- [License](#-license)
- [Contact](#-contact)

---

## 🏆 About the Project

**SilverConnect India** is a full-stack web platform built specifically for retired and experienced Indian professionals. It bridges the gap between decades of industry knowledge sitting idle in retirement — and the rapidly growing ecosystem of startups, SMEs, students, and businesses that desperately need that real-world experience.

Whether you are a retired SBI branch manager, a former BHEL factory GM, a retired IAS officer, or an ex-HR director from TCS — your experience has enormous value. SilverConnect India gives you the tools to share it, earn from it, and be respected for it.

### Mission

> *"Helping experience stay valuable."*

### Vision

To become **India's most trusted marketplace** for retired professionals — as easy to use as WhatsApp, as trustworthy as a government institution, and as rewarding as a second career.

---

## 🎯 The Problem We Solve

| For Retired Professionals | For Businesses & Startups |
|:---|:---|
| ❌ No platform built *for* them — everything is too technical | ❌ Can't afford full-time senior executives |
| ❌ Feel disconnected and undervalued after retirement | ❌ Young founders lack real industry experience |
| ❌ Miss the purpose and respect of working life | ❌ Costly mistakes that an experienced advisor would prevent |
| ❌ Need extra income but don't want full-time commitment | ❌ No easy way to find verified, credible retired talent |
| ✅ **SilverConnect solves all of this** | ✅ **SilverConnect solves all of this** |

**India has over 2 crore retired professionals** — engineers, bankers, doctors, teachers, HR leaders, government officers — sitting on a goldmine of experience with no structured way to deploy it. SilverConnect India is that structure.

---

## ✨ Key Features

### 👤 For Retired Professionals
- ✅ **Simple Profile Creation** — 5-minute onboarding, no technical knowledge needed
- ✅ **Work on Your Terms** — Choose consulting, mentoring, teaching, or advisory
- ✅ **Set Your Own Rate** — You control your hourly price (₹300 to ₹2,000+/hr)
- ✅ **WhatsApp-First Support** — Our team helps you personally via WhatsApp
- ✅ **Secure Payments** — Direct to your bank account via Razorpay after every session
- ✅ **Verified Badge** — ID and experience verification builds client trust

### 🏢 For Businesses & Startups
- ✅ **Search & Filter Mentors** — By industry, skill, experience, and budget
- ✅ **Book Consultations** — Schedule video calls or in-person meetings
- ✅ **Hire for Projects** — 3–6 month part-time engagements
- ✅ **Advisory Board Members** — Credible retired leaders for your startup
- ✅ **Instant Matching** — AI-powered mentor recommendations

### 🤝 Community
- ✅ **Discussion Rooms** — By industry (Banking, Engineering, Healthcare, etc.)
- ✅ **Live Webinars** — Weekly sessions by retired experts
- ✅ **WhatsApp Groups** — City-based communities for real connections
- ✅ **Knowledge Sharing** — Articles, tips, and industry insights

### 🛠️ Platform Features
- ✅ OTP-based login (no complicated passwords)
- ✅ Admin dashboard with profile verification
- ✅ AI mentor-to-business matching
- ✅ Razorpay payment integration (UPI, Cards, Wallets)
- ✅ Mobile-first responsive design
- ✅ Senior-friendly UI (large fonts, big buttons, simple flows)

---

## 📸 Screenshots

| Homepage | Mentor Marketplace | Mentor Profile |
|:---:|:---:|:---:|
| ![Home](docs/screenshots/home.png) | ![Mentors](docs/screenshots/mentors.png) | ![Profile](docs/screenshots/profile.png) |

| Join as Mentor | For Businesses | Admin Dashboard |
|:---:|:---:|:---:|
| ![Join](docs/screenshots/join.png) | ![Business](docs/screenshots/business.png) | ![Admin](docs/screenshots/admin.png) |

> 📌 *Screenshots will be added once MVP is live.*

---

## 🛠️ Tech Stack

### Frontend
| Technology | Purpose |
|:---|:---|
| [Next.js 14](https://nextjs.org) | React framework with App Router & SSR |
| [Tailwind CSS](https://tailwindcss.com) | Utility-first styling |
| [Lucide React](https://lucide.dev) | Icons |
| [Framer Motion](https://framer.motion.com) | Animations |
| [React Hook Form](https://react-hook-form.com) | Form management |
| [Zod](https://zod.dev) | Schema validation |
| [React DatePicker](https://reactdatepicker.com) | Booking calendar |

### Backend & Database
| Technology | Purpose |
|:---|:---|
| [Next.js API Routes](https://nextjs.org/docs/api-routes/introduction) | Serverless API endpoints |
| [Supabase](https://supabase.com) | PostgreSQL database + Auth + Storage |
| [Supabase Auth](https://supabase.com/auth) | OTP-based authentication |
| [Supabase Storage](https://supabase.com/storage) | Profile photos & documents |

### Integrations
| Service | Purpose |
|:---|:---|
| [Razorpay](https://razorpay.com) | Payments — UPI, Cards, Wallets |
| [Twilio](https://twilio.com) | OTP SMS + WhatsApp notifications |
| [WATI](https://wati.io) | WhatsApp Business API automation |
| [OpenAI API](https://openai.com) | AI mentor matching & profile builder |
| [Resend](https://resend.com) | Transactional emails |

### DevOps & Deployment
| Tool | Purpose |
|:---|:---|
| [Vercel](https://vercel.com) | Frontend deployment + CDN |
| [GitHub Actions](https://github.com/features/actions) | CI/CD pipeline |
| [Upstash Redis](https://upstash.com) | Rate limiting + caching |
| [Plausible](https://plausible.io) | Privacy-friendly analytics |

---

## 🚀 Getting Started

### Prerequisites

Make sure you have the following installed:

```bash
node >= 18.0.0
npm >= 9.0.0
git
```

### 1. Clone the Repository

```bash
git clone https://github.com/your-username/silverconnect-india.git
cd silverconnect-india
```

### 2. Install Dependencies

```bash
npm install
```

### 3. Set Up Environment Variables

```bash
cp .env.example .env.local
```

Open `.env.local` and fill in your values:

```env
# Supabase
NEXT_PUBLIC_SUPABASE_URL=https://your-project.supabase.co
NEXT_PUBLIC_SUPABASE_ANON_KEY=your-anon-key
SUPABASE_SERVICE_ROLE_KEY=your-service-role-key

# Razorpay
RAZORPAY_KEY_ID=rzp_test_xxxxxxxxxxxx
RAZORPAY_KEY_SECRET=your-secret
NEXT_PUBLIC_RAZORPAY_KEY_ID=rzp_test_xxxxxxxxxxxx

# Twilio (OTP)
TWILIO_ACCOUNT_SID=ACxxxxxxxxxxxxxxxx
TWILIO_AUTH_TOKEN=your-auth-token
TWILIO_PHONE_NUMBER=+1415xxxxxxx

# JWT
JWT_SECRET=your-minimum-32-character-secret-key

# OpenAI
OPENAI_API_KEY=sk-xxxxxxxxxxxxxxxx
```

### 4. Set Up the Database

Run the following SQL in your Supabase SQL editor:

```sql
-- See database/schema.sql for the full schema
\i database/schema.sql
```

### 5. Run the Development Server

```bash
npm run dev
```

Open [http://localhost:3000](http://localhost:3000) in your browser. 🎉

### 6. Build for Production

```bash
npm run build
npm run start
```

---

## 📁 Project Structure

```
silverconnect-india/
│
├── src/
│   ├── app/                          # Next.js App Router
│   │   ├── layout.jsx                # Root layout with nav + footer
│   │   ├── page.jsx                  # Homepage
│   │   ├── globals.css               # Global styles
│   │   │
│   │   ├── mentors/                  # Mentor marketplace
│   │   │   ├── page.jsx              # Mentor listing with filters
│   │   │   └── [id]/
│   │   │       └── page.jsx          # Individual mentor profile
│   │   │
│   │   ├── business/
│   │   │   └── page.jsx              # Hiring page for businesses
│   │   │
│   │   ├── community/
│   │   │   └── page.jsx              # Community, webinars, rooms
│   │   │
│   │   ├── join/
│   │   │   └── page.jsx              # Signup (mentor + business)
│   │   │
│   │   ├── login/
│   │   │   └── page.jsx              # OTP login page
│   │   │
│   │   ├── dashboard/
│   │   │   └── page.jsx              # Mentor/business dashboard
│   │   │
│   │   ├── admin/                    # 🔒 Protected admin panel
│   │   │   └── page.jsx
│   │   │
│   │   └── api/                      # Serverless API routes
│   │       ├── auth/
│   │       │   ├── send-otp/route.js
│   │       │   └── verify-otp/route.js
│   │       ├── mentors/
│   │       │   └── route.js          # GET (list), POST (create)
│   │       ├── mentors/[id]/
│   │       │   └── route.js          # GET, PUT, DELETE
│   │       ├── bookings/
│   │       │   └── route.js
│   │       ├── ai-match/
│   │       │   └── route.js          # AI mentor recommendation
│   │       └── payment/
│   │           ├── create-order/route.js
│   │           └── webhook/route.js
│   │
│   ├── components/
│   │   ├── layout/
│   │   │   ├── Navbar.jsx
│   │   │   ├── Footer.jsx
│   │   │   └── WhatsAppFloat.jsx
│   │   │
│   │   ├── home/
│   │   │   ├── Hero.jsx
│   │   │   ├── Stats.jsx
│   │   │   ├── HowItWorks.jsx
│   │   │   ├── Categories.jsx
│   │   │   ├── Testimonials.jsx
│   │   │   └── CTASection.jsx
│   │   │
│   │   ├── mentors/
│   │   │   ├── MentorCard.jsx
│   │   │   ├── MentorProfile.jsx
│   │   │   ├── FilterBar.jsx
│   │   │   └── RatingStars.jsx
│   │   │
│   │   ├── booking/
│   │   │   ├── BookingModal.jsx
│   │   │   ├── CalendarPicker.jsx
│   │   │   └── TimeSlots.jsx
│   │   │
│   │   ├── auth/
│   │   │   ├── OTPModal.jsx
│   │   │   └── LoginGuard.jsx
│   │   │
│   │   ├── admin/
│   │   │   ├── AdminSidebar.jsx
│   │   │   ├── UserTable.jsx
│   │   │   ├── Analytics.jsx
│   │   │   └── VerifyProfile.jsx
│   │   │
│   │   └── ui/
│   │       ├── Button.jsx
│   │       ├── Card.jsx
│   │       ├── Modal.jsx
│   │       ├── Badge.jsx
│   │       ├── Input.jsx
│   │       ├── Skeleton.jsx
│   │       └── Toast.jsx
│   │
│   ├── lib/
│   │   ├── supabase.js               # Supabase client
│   │   ├── supabase-server.js        # Server-side Supabase client
│   │   ├── razorpay.js               # Razorpay helpers
│   │   ├── twilio.js                 # OTP via Twilio
│   │   ├── ai-match.js               # OpenAI mentor matching
│   │   ├── auth.js                   # JWT helpers
│   │   └── validations.js            # Zod schemas
│   │
│   ├── hooks/
│   │   ├── useAuth.js                # Auth state + OTP flow
│   │   ├── useMentors.js             # Mentor data fetching
│   │   ├── useBooking.js             # Booking flow
│   │   └── useAdmin.js               # Admin operations
│   │
│   └── data/
│       └── mockData.js               # Seed data for development
│
├── database/
│   ├── schema.sql                    # Full PostgreSQL schema
│   └── seed.sql                      # Sample data for dev
│
├── public/
│   ├── favicon.ico
│   ├── og-image.png                  # Open Graph preview image
│   └── logo.png
│
├── docs/
│   └── screenshots/                  # App screenshots
│
├── .env.example                      # Environment variable template
├── .gitignore
├── next.config.js
├── tailwind.config.js
├── postcss.config.js
└── package.json
```

---

## 🗄️ Database Schema

```sql
-- Core Tables

-- Users (both mentors and businesses)
CREATE TABLE users (
  id            UUID PRIMARY KEY DEFAULT gen_random_uuid(),
  phone         VARCHAR(15) UNIQUE NOT NULL,
  email         VARCHAR(255),
  full_name     VARCHAR(100) NOT NULL,
  user_type     VARCHAR(20) CHECK (user_type IN ('mentor', 'business', 'admin')),
  city          VARCHAR(100),
  is_verified   BOOLEAN DEFAULT false,
  created_at    TIMESTAMPTZ DEFAULT NOW()
);

-- Mentor Profiles
CREATE TABLE mentors (
  id              UUID PRIMARY KEY DEFAULT gen_random_uuid(),
  user_id         UUID REFERENCES users(id) ON DELETE CASCADE,
  bio             TEXT,
  industry        VARCHAR(100) NOT NULL,
  last_company    VARCHAR(200),
  years_exp       INTEGER NOT NULL,
  skills          TEXT[],            -- Array of skill tags
  work_types      TEXT[],            -- consulting, mentoring, teaching, etc.
  hourly_rate     INTEGER NOT NULL,  -- in INR
  availability    JSONB,             -- { days: [], hours: "" }
  languages       TEXT[],
  is_active       BOOLEAN DEFAULT true,
  avg_rating      DECIMAL(3,1) DEFAULT 0.0,
  total_sessions  INTEGER DEFAULT 0,
  created_at      TIMESTAMPTZ DEFAULT NOW()
);

-- Bookings
CREATE TABLE bookings (
  id              UUID PRIMARY KEY DEFAULT gen_random_uuid(),
  mentor_id       UUID REFERENCES mentors(id),
  client_id       UUID REFERENCES users(id),
  session_date    TIMESTAMPTZ NOT NULL,
  duration_mins   INTEGER DEFAULT 60,
  work_type       VARCHAR(50),
  status          VARCHAR(20) DEFAULT 'pending',
                  -- pending | confirmed | completed | cancelled
  amount          INTEGER NOT NULL,   -- total in INR
  platform_fee    INTEGER NOT NULL,   -- commission taken
  razorpay_order  VARCHAR(100),
  notes           TEXT,
  created_at      TIMESTAMPTZ DEFAULT NOW(),
  UNIQUE(mentor_id, session_date)     -- prevent double-booking
);

-- Reviews
CREATE TABLE reviews (
  id          UUID PRIMARY KEY DEFAULT gen_random_uuid(),
  booking_id  UUID REFERENCES bookings(id),
  reviewer_id UUID REFERENCES users(id),
  mentor_id   UUID REFERENCES mentors(id),
  rating      INTEGER CHECK (rating BETWEEN 1 AND 5),
  comment     TEXT,
  created_at  TIMESTAMPTZ DEFAULT NOW()
);

-- Business Profiles
CREATE TABLE businesses (
  id           UUID PRIMARY KEY DEFAULT gen_random_uuid(),
  user_id      UUID REFERENCES users(id) ON DELETE CASCADE,
  company_name VARCHAR(200) NOT NULL,
  industry     VARCHAR(100),
  company_size VARCHAR(50),
  website      VARCHAR(255),
  created_at   TIMESTAMPTZ DEFAULT NOW()
);

-- OTP Verification
CREATE TABLE otp_verifications (
  id          UUID PRIMARY KEY DEFAULT gen_random_uuid(),
  phone       VARCHAR(15) NOT NULL,
  otp_hash    VARCHAR(255) NOT NULL,
  expires_at  TIMESTAMPTZ NOT NULL,
  used        BOOLEAN DEFAULT false,
  created_at  TIMESTAMPTZ DEFAULT NOW()
);
```

---

## 📡 API Reference

### Authentication

```http
POST /api/auth/send-otp
Content-Type: application/json

{ "phone": "9876543210" }

---

POST /api/auth/verify-otp
Content-Type: application/json

{ "phone": "9876543210", "otp": "123456" }
```

### Mentors

```http
GET /api/mentors
  ?industry=Banking
  &minRate=500
  &maxRate=2000
  &skills=Finance,Risk
  &page=1&limit=12

GET /api/mentors/:id

POST /api/mentors          (🔒 Authenticated)
PUT  /api/mentors/:id      (🔒 Authenticated)
```

### Bookings

```http
POST /api/bookings          (🔒 Authenticated)
Content-Type: application/json

{
  "mentorId": "uuid",
  "sessionDate": "2025-06-15T10:00:00Z",
  "durationMins": 60,
  "workType": "consulting"
}

GET  /api/bookings          (🔒 Authenticated — lists your bookings)
PUT  /api/bookings/:id      (🔒 Authenticated — confirm/cancel)
```

### Payments

```http
POST /api/payment/create-order    (🔒 Authenticated)
Content-Type: application/json

{ "bookingId": "uuid", "amount": 80000 }   -- amount in paise

POST /api/payment/webhook          -- Razorpay webhook (no auth)
```

### AI Matching

```http
POST /api/ai-match
Content-Type: application/json

{
  "requirement": "We need help with our HR processes and hiring strategy for a 50-person manufacturing company",
  "industry": "Manufacturing",
  "budget": 1000
}
```

---

## 💰 Business Model

SilverConnect India earns revenue through multiple streams:

```
┌─────────────────────────────────────────────────────────┐
│                    REVENUE STREAMS                       │
├───────────────────────┬─────────────────────────────────┤
│  Consultation Fee     │  20% platform commission        │
│  Commission           │  Example: ₹500 session → ₹100  │
├───────────────────────┼─────────────────────────────────┤
│  Business             │  ₹2,999/month — Unlimited       │
│  Subscription         │  mentor access for companies    │
├───────────────────────┼─────────────────────────────────┤
│  Premium Profiles     │  ₹499/month — Boosted           │
│                       │  visibility for mentors         │
├───────────────────────┼─────────────────────────────────┤
│  Corporate            │  Bulk packages for hospitals,   │
│  Partnerships         │  factories, colleges, NGOs      │
├───────────────────────┼─────────────────────────────────┤
│  Paid Webinars        │  ₹199–₹999 per workshop         │
│  & Training           │  hosted by retired experts      │
└───────────────────────┴─────────────────────────────────┘
```

---

## 🗺️ Roadmap

### ✅ Phase 1 — Validation (Completed)
- [x] Business concept defined
- [x] Landing page created
- [x] WhatsApp business account set up
- [x] Initial HTML prototype built

### 🔄 Phase 2 — MVP (In Progress)
- [x] Homepage with all sections
- [x] Mentor marketplace UI
- [x] Signup forms (mentor + business)
- [ ] Connect forms to Supabase database
- [ ] OTP login via Twilio
- [ ] Basic admin dashboard
- [ ] Razorpay payment integration

### 📅 Phase 3 — Growth (Q3 2025)
- [ ] AI mentor matching
- [ ] WhatsApp onboarding bot (WATI)
- [ ] Email drip campaigns (Resend)
- [ ] Booking calendar with availability
- [ ] Review and rating system
- [ ] SEO optimisation + sitemap

### 🚀 Phase 4 — Scale (Q4 2025+)
- [ ] Hindi and Tamil language support
- [ ] Android mobile app
- [ ] Voice assistance for senior users
- [ ] Government partnership portal
- [ ] Video consultation (Jitsi / Daily.co)
- [ ] Aadhaar-based identity verification
- [ ] Regional language AI assistant

---

## 🤝 Contributing

Contributions are what make open source incredible. Any contributions you make are **greatly appreciated**.

1. **Fork** the repository
2. **Create** your feature branch: `git checkout -b feature/AmazingFeature`
3. **Commit** your changes: `git commit -m 'Add some AmazingFeature'`
4. **Push** to the branch: `git push origin feature/AmazingFeature`
5. **Open** a Pull Request

### Areas Where Help is Needed

| Area | Skills Needed |
|:---|:---|
| 🔐 Auth & Security | Next.js middleware, Supabase Auth, JWT |
| 💳 Payments | Razorpay API, webhooks |
| 🤖 AI Matching | OpenAI API, prompt engineering |
| 🌐 i18n | Hindi / Tamil translation |
| ♿ Accessibility | ARIA, WCAG, screen readers |
| 📱 Mobile App | React Native or Flutter |
| 🎨 UI/UX | Senior-friendly design, Figma |

Please read [CONTRIBUTING.md](CONTRIBUTING.md) for our code of conduct and contribution guidelines.

---

## 🔐 Security

If you discover a security vulnerability, please **do not** open a public GitHub issue. Instead, email us directly at **security@silverconnect.in**.

We take security seriously — especially for a platform used by senior citizens whose data must be protected.

---

## 📄 License

Distributed under the **MIT License**. See [`LICENSE`](LICENSE) for more information.

---

## 📬 Contact

**SilverConnect India Team**

| Channel | Details |
|:---|:---|
| 🌐 Website | [silverconnect.in](https://silver-mentor-connect--zukiiyoo.replit.app) |
| 📧 Email | hello@silverconnect.in |
| 💬 WhatsApp | [+91 98765 00001](https://wa.me/919876500001) |
| 📸 Instagram | [@silverconnect.india](https://instagram.com) |
| 💼 LinkedIn | [SilverConnect India](https://linkedin.com) |

---

## 🙏 Acknowledgements

- Every retired professional in India whose experience deserves a second life
- The Indian startup ecosystem that needs mentorship more than it knows
- Open source projects: [Next.js](https://nextjs.org), [Supabase](https://supabase.com), [Tailwind CSS](https://tailwindcss.com), [Razorpay](https://razorpay.com)
- Inspired by [WisdomCircle](https://wisdomcircle.com), [Clarity.fm](https://clarity.fm), and [MentorCruise](https://mentorcruise.com)

---

<div align="center">

**Built with ❤️ for India's retired heroes**

*"Experience should never retire."* 🇮🇳

⭐ **Star this repo** if you believe experienced professionals deserve better opportunities!

</div>
