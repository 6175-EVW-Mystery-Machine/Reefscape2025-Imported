package frc.robot.subsystems;

import com.revrobotics.spark.SparkMax;
import com.revrobotics.spark.SparkLowLevel.MotorType;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants.MyConstants;

public class AlgaeSubsystem extends SubsystemBase {

    private final SparkMax m_algaeIntakeMotor;
    DigitalInput m_algaeLimitSwitch = new DigitalInput(MyConstants.c_algaeLimitSwitchPort);


    public AlgaeSubsystem() {

        m_algaeIntakeMotor = new SparkMax(MyConstants.c_algaeIntakeCAN, MotorType.kBrushless);

    }
    
@Override
public void periodic() {
    SmartDashboard.putBoolean("Algae Limit Switch", m_algaeLimitSwitch.get());
}

public void runAlgaeIntake() {
    m_algaeIntakeMotor.set(MyConstants.c_intakeAlgaeSpeed);
}
public void stopAlgaeIntake() {
    m_algaeIntakeMotor.set(MyConstants.c_intakeAlgaeStopSpeed);
}

public void algaeIntakeSeq() {
    if (!m_algaeLimitSwitch.get()) {
        m_algaeIntakeMotor.set(MyConstants.c_intakeAlgaeStopSpeed);
    } else {
        m_algaeIntakeMotor.set(MyConstants.c_intakeAlgaeSpeed);
    }
}

}
