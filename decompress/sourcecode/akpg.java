import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akpg extends agzi implements ahax
{
    public static final akpg a;
    private static volatile ahbe b;
    private int c;
    private ajya d;
    private byte e;
    
    static {
        agzi.registerDefaultInstance(akpg.class, a = new akpg());
    }
    
    private akpg() {
        this.e = 2;
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
                final ahbe b2;
                if ((b2 = akpg.b) == null) {
                    synchronized (akpg.class) {
                        if (akpg.b == null) {
                            akpg.b = (ahbe)new agzb((agzi)akpg.a);
                        }
                    }
                }
                return b2;
            }
            case 5: {
                return akpg.a;
            }
            case 4: {
                return new agza((agzi)akpg.a);
            }
            case 3: {
                return new akpg();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)akpg.a, "\u0001\u0001\u0000\u0001\ue0ae\u2d72\ue0ae\u2d72\u0001\u0000\u0000\u0001\ue0ae\u2d72\u1409\u0000", new Object[] { "c", "d" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.e = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.e;
            }
        }
    }
}