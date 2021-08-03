package `in`.papaya.swipeviewmotionlayout

import android.animation.Animator
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.constraintlayout.motion.widget.MotionLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val ml = findViewById<MotionLayout>(R.id.motionLayout)

        ml.addTransitionListener(object : MotionLayout.TransitionListener{
            override fun onTransitionStarted(
                motionLayout: MotionLayout?,
                startId: Int,
                endId: Int
            ) {
//                TODO("Not yet implemented")
            }

            override fun onTransitionChange(
                motionLayout: MotionLayout?,
                startId: Int,
                endId: Int,
                progress: Float
            ) {
//                TODO("Not yet implemented")
            }

            override fun onTransitionCompleted(motionLayout: MotionLayout?, currentId: Int) {
               if (currentId == R.id.end2){
                   ml.animate()
                       .alpha(0f)
                       .setDuration(2250)
                       .setListener(object : Animator.AnimatorListener{
                           override fun onAnimationStart(p0: Animator?) {
//                               TODO("Not yet implemented")
                           }

                           override fun onAnimationEnd(p0: Animator?) {
                               Toast.makeText(this@MainActivity, "Message Deleted", Toast.LENGTH_SHORT).show()
                           }

                           override fun onAnimationCancel(p0: Animator?) {
//                               TODO("Not yet implemented")
                           }

                           override fun onAnimationRepeat(p0: Animator?) {
//                               TODO("Not yet implemented")
                           }

                       })
               }
            }

            override fun onTransitionTrigger(
                motionLayout: MotionLayout?,
                triggerId: Int,
                positive: Boolean,
                progress: Float
            ) {
//                TODO("Not yet implemented")
            }

        })
    }
}