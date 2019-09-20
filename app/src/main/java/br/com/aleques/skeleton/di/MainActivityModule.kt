package br.com.aleques.skeleton.di

import br.com.aleques.skeleton.ui.helloWorldFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class MainActivityModule {
    @FragmentScope
    @ContributesAndroidInjector
    abstract fun contributesHelloWorldFragment() : helloWorldFragment
}