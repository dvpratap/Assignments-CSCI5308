
public class SpawnShieldCommand extends Command
{
    public SpawnShieldCommand(Object receiver, String[] args)
    {
        super(receiver, args);
    }

    @Override
    public void Execute()
    {
        // The receiver for the SpawnAsteroidCommand is the Square to spawn the asteroid in.
        Square square = (Square) receiver;
        // The args for SpawnAsteroidCommand are the X,Y coordinate for the asteroid
        // used by the factory, and the height of the asteroid.
        //int height = Integer.parseInt(args[2]);
        IAsteroidGameFactory factory = GameBoard.Instance().GetFactory();
        System.out.println("Spawning shield at (" + args[0] + "," + args[1] + ")");
        square.Add(factory.MakeShield());
        Subject.Instance().attach(square);
    }
}

