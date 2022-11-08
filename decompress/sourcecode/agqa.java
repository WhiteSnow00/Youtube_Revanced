import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agqa extends agzi implements ahax
{
    public static final agqa a;
    private static volatile ahbe c;
    public aega b;
    private byte d;
    
    static {
        agzi.registerDefaultInstance(agqa.class, a = new agqa());
    }
    
    private agqa() {
        this.d = 2;
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        final int ordinal = agzh.ordinal();
        boolean b = false;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe c;
                if ((c = agqa.c) == null) {
                    synchronized (agqa.class) {
                        if (agqa.c == null) {
                            agqa.c = (ahbe)new agzb((agzi)agqa.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return agqa.a;
            }
            case 4: {
                return new agza((agzi)agqa.a);
            }
            case 3: {
                return new agqa();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)agqa.a, "\u0000\u0001\u0000\u0000\u0003\u0003\u0001\u0000\u0000\u0001\u0003\u0409", new Object[] { "b" });
            }
            case 1: {
                if (o != null) {
                    b = true;
                }
                this.d = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.d;
            }
        }
    }
}
