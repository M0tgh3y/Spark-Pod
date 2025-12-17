package com.example.afterreinstall

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

sealed class Screen(val route: String) {
    object Home : Screen("home")
    object Test : Screen("test")
    object List : Screen("list")
    object Settings : Screen("settings")
    object ChoosePerson : Screen("choose-person")
    object TestDetail : Screen("test_detail")
    object AfterStart : Screen("after_start")
    object ChoosePod : Screen("choose_pod")
    object AddList : Screen("add_list")
    object NameList : Screen("name_list")
    object PersonPage : Screen("person_page")
    object AddPerson : Screen("add_person")
    object PodSetting : Screen("pod_setting")
    object ReportPage : Screen("report_page")
}

@Composable
fun NavGraph(navController: NavHostController, modifier: Modifier = Modifier) {

    NavHost(
        navController = navController,
        startDestination = Screen.Home.route
    ) {
        composable(Screen.Home.route) { HomeScreen(navController) }
        composable(Screen.Test.route) { TestScreen(navController, onClick = {}) }
        composable(Screen.List.route) { ListScreen(navController, onClick = {}) }
        composable(Screen.Settings.route) { SettingsScreen() }
        composable(Screen.ChoosePerson.route) { ChoosePersonScreen(navController) }
        composable(Screen.TestDetail.route) { TestDetailScreen(navController) }
        composable(Screen.AfterStart.route) { AfterStartScreen(navController) }
        composable(Screen.ChoosePod.route) { ChoosePodsScreen() }
        composable(Screen.AddList.route) { AddAListScreen(onClick = {}) }
        composable(Screen.NameList.route) { NameListScreen(navController) }
        composable(Screen.PersonPage.route) { APersonScreen(navController) }
        composable(Screen.AddPerson.route) { AddAPersonScreen(onClick = {}) }
        composable(Screen.PodSetting.route) { PodSettingScreen() }
        composable(Screen.ReportPage.route) { ReportScreen() }
    }
}
