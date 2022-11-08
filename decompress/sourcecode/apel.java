import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apel extends agzi implements ahax
{
    public static final apel a;
    private static volatile ahbe f;
    public ajsq b;
    public ajsq c;
    public aorm d;
    public boolean e;
    private int g;
    private byte h;
    
    static {
        agzi.registerDefaultInstance(apel.class, a = new apel());
    }
    
    private apel() {
        this.h = 2;
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
                final ahbe f;
                if ((f = apel.f) == null) {
                    synchronized (apel.class) {
                        if (apel.f == null) {
                            apel.f = (ahbe)new agzb((agzi)apel.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return apel.a;
            }
            case 4: {
                return new agza((agzi)apel.a);
            }
            case 3: {
                return new apel();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)apel.a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0003\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0002\u0004\u1007\u0003", new Object[] { "g", "b", "c", "d", "e" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.h = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.h;
            }
        }
    }
}
