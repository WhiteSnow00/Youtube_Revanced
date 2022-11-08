import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aplu extends agzi implements ahax
{
    public static final aplu a;
    private static volatile ahbe f;
    public int b;
    public aplx c;
    public agyc d;
    public aplv e;
    private ajsq g;
    private aioe h;
    private ahfw i;
    private apls j;
    private byte k;
    
    static {
        agzi.registerDefaultInstance(aplu.class, a = new aplu());
    }
    
    private aplu() {
        this.k = 2;
        this.d = agyc.b;
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
                if ((f = aplu.f) == null) {
                    synchronized (aplu.class) {
                        if (aplu.f == null) {
                            aplu.f = (ahbe)new agzb((agzi)aplu.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return aplu.a;
            }
            case 4: {
                return new agza((agzi)aplu.a);
            }
            case 3: {
                return new aplu();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aplu.a, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0005\u0001\u1009\u0000\u0002\u1409\u0001\u0003\u1409\u0002\u0004\u100a\u0003\u0005\u1409\u0004\u0006\u1409\u0005\u0007\u1409\u0006", new Object[] { "b", "c", "g", "h", "d", "i", "j", "e" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.k = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.k;
            }
        }
    }
}
