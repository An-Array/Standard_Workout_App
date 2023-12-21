package com.daike.workoutapp

object Constants {

    fun defaultExerciseList(): ArrayList<ExerciseModel>{
        val exerciseList = ArrayList<ExerciseModel>()
        val jumpingJacks = ExerciseModel(
            1,
            "JumpingJacks",
            R.drawable.ic_jumping_jack,
            false,
            false
        )
        exerciseList.add(jumpingJacks)

        val highKneesRunning = ExerciseModel(
            2,
            "High Knees Running",
            R.drawable.ic_high_knees_running,
            false,
            false
        )
        exerciseList.add(highKneesRunning)

        val lunges = ExerciseModel(
            3,
            "Lunges",
            R.drawable.ic_lunges,
            false,
            false
        )
        exerciseList.add(lunges)

        val plank = ExerciseModel(
            4,
            "Plank",
            R.drawable.ic_plank,
            false,
            false
        )
        exerciseList.add(plank)

        val pushUps = ExerciseModel(
            5,
            "Push Ups",
            R.drawable.ic_push_up,
            false,
            false
        )
        exerciseList.add(pushUps)

        val pushUpsAndRotation = ExerciseModel(
            6,
            "PushUps and Rotation",
            R.drawable.ic_pushup_and_rotation,
            false,
            false
        )
        exerciseList.add(pushUpsAndRotation)

        val sidePlank = ExerciseModel(
            7,
            "Side Plank",
            R.drawable.ic_side_plank,
            false,
            false
        )
        exerciseList.add(sidePlank)

        val stepOntoChair = ExerciseModel(
            8,
            "Step on Chair",
            R.drawable.ic_step_up_onto_chair,
            false,
            false
        )
        exerciseList.add(stepOntoChair)

        val tricepsDip = ExerciseModel(
            9,
            "Triceps Dip",
            R.drawable.ic_tricep_dip_on_chair,
            false,
            false
        )
        exerciseList.add(tricepsDip)

        val wallSit = ExerciseModel(
            10,
            "Wall Sit",
            R.drawable.ic_wall_sit,
            false,
            false
        )
        exerciseList.add(wallSit)

        val abdominalCrunches = ExerciseModel(
            11,
            "Abdominal Crunches",
            R.drawable.ic_abdominal_crunches,
            false,
            false
        )
        exerciseList.add(abdominalCrunches)

        return exerciseList
    }

}