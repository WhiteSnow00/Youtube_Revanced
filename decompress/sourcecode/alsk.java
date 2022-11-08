import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alsk extends agzi implements ahax
{
    public static final alsk a;
    private static volatile ahbe i;
    public int b;
    public long c;
    public ajsq d;
    public ajsq e;
    public aorm f;
    public agzy g;
    public alsj h;
    private boolean j;
    private anss k;
    private alsl l;
    private byte m;
    
    static {
        agzi.registerDefaultInstance(alsk.class, a = new alsk());
    }
    
    private alsk() {
        this.m = 2;
        this.g = agzi.emptyProtobufList();
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        final int ordinal = agzh.ordinal();
        boolean b = true;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe i;
                if ((i = alsk.i) == null) {
                    synchronized (alsk.class) {
                        if (alsk.i == null) {
                            alsk.i = (ahbe)new agzb((agzi)alsk.a);
                        }
                    }
                }
                return i;
            }
            case 5: {
                return alsk.a;
            }
            case 4: {
                return new agza((byte[])null, (byte[])null);
            }
            case 3: {
                return new alsk();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)alsk.a, "\u0001\t\u0000\u0001\u0001\n\t\u0000\u0001\u0007\u0001\u1002\u0000\u0002\u1007\u0001\u0003\u1409\u0002\u0004\u1409\u0003\u0005\u1409\u0004\u0006\u041b\u0007\u1409\u0006\t\u1409\u0005\n\u1409\b", new Object[] { "b", "c", "j", "d", "e", "f", "g", aibc.class, "l", "k", "h" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.m = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.m;
            }
        }
    }
}
