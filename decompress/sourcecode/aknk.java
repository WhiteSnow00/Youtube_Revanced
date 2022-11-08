import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aknk extends agzi implements ahax
{
    public static final aknk a;
    private static volatile ahbe e;
    public int b;
    public ajsq c;
    public ajsq d;
    private int f;
    private byte g;
    
    static {
        agzi.registerDefaultInstance(aknk.class, a = new aknk());
    }
    
    private aknk() {
        this.g = 2;
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
                final ahbe e;
                if ((e = aknk.e) == null) {
                    synchronized (aknk.class) {
                        if (aknk.e == null) {
                            aknk.e = (ahbe)new agzb((agzi)aknk.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return aknk.a;
            }
            case 4: {
                return new agza((agzi)aknk.a);
            }
            case 3: {
                return new aknk();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aknk.a, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0002\u0001\u100c\u0000\u0003\u1409\u0002\u0004\u1409\u0003", new Object[] { "f", "b", akhl.n, "c", "d" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.g = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.g;
            }
        }
    }
}
