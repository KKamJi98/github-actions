import { describe, it, expect } from 'vitest'
import { mount } from '@vue/test-utils'
import App from '../src/App.vue'

describe('App.vue', () => {
  it('renders the title correctly', () => {
    const wrapper = mount(App)
    expect(wrapper.find('h1').text()).toBe('Vue Multi-Architecture Demo')
  })

  it('displays architecture information section', () => {
    const wrapper = mount(App)
    expect(wrapper.find('.architecture-info').exists()).toBe(true)
  })
})