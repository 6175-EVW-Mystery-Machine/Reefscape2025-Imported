package frc.robot.subsystems;

import com.revrobotics.spark.SparkMax;
import com.revrobotics.spark.SparkLowLevel.MotorType;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants.MyConstants;

public class ExampleClaw extends SubsystemBase {
  
  private final SparkMax m_exampleClawMotor;

  public ExampleClaw() {

    m_exampleClawMotor = new SparkMax(MyConstants.c_exampleClawCAN, MotorType.kBrushless);

  }

  @Override
  public void periodic() {

  }

public void runClaw(double speed) {
  m_exampleClawMotor.set(speed);
}

}
