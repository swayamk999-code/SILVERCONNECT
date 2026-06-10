// next.config.js
/** @type {import('next').NextConfig} */
const nextConfig = {
  images: {
    domains: ['images.unsplash.com', 'ui-avatars.com'],
  },
  experimental: {
    optimizeCss: true,
  },
}

module.exports = nextConfig
