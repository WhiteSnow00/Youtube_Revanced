import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akqc extends agzi implements ahax
{
    public static final akqc a;
    private static volatile ahbe f;
    public int b;
    public akjd c;
    public alme d;
    public String e;
    private byte g;
    
    static {
        agzi.registerDefaultInstance(akqc.class, a = new akqc());
    }
    
    private akqc() {
        this.g = 2;
        this.e = "";
        final agyc b = agyc.b;
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
                if ((f = akqc.f) == null) {
                    synchronized (akqc.class) {
                        if (akqc.f == null) {
                            akqc.f = (ahbe)new agzb((agzi)akqc.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return akqc.a;
            }
            case 4: {
                return new agza((agzi)akqc.a);
            }
            case 3: {
                return new akqc();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)akqc.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001\u1409\u0000\u0002\u1009\u0001\u0003\u1008\u0002", new Object[] { "b", "c", "d", "e" });
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
