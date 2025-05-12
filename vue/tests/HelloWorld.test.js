import { describe, it, expect } from 'vitest'
import { mount } from '@vue/test-utils'
import HelloWorld from '../src/components/HelloWorld.vue'

describe('HelloWorld.vue', () => {
  it('renders props.msg when passed', () => {
    const msg = 'Test Message'
    const wrapper = mount(HelloWorld, {
      props: { msg }
    })
    expect(wrapper.text()).toContain(msg)
  })

  it('uses default message when no prop is passed', () => {
    const wrapper = mount(HelloWorld)
    expect(wrapper.text()).toContain('Welcome to Vue.js')
  })
})