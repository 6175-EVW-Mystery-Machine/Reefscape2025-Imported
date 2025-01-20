package frc.robot.subsystems;

import com.revrobotics.spark.SparkMax;
import com.revrobotics.spark.SparkLowLevel.MotorType;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants.MyConstants;

public class AlgaeIntake extends SubsystemBase {

    private final SparkMax m_algaeIntakeMotor;

    public AlgaeIntake() {

        m_algaeIntakeMotor = new SparkMax(MyConstants.c_algaeIntakeCAN, MotorType.kBrushless);

    }
    
@Override
public void periodic() {

}

public void runAlgaeIntake(double speed) {
    m_algaeIntakeMotor.set(speed);
}

}
