import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apby extends agzi implements ahax
{
    public static final apby a;
    private static volatile ahbe b;
    private int c;
    private ajsq d;
    private byte e;
    
    static {
        agzi.registerDefaultInstance(apby.class, a = new apby());
    }
    
    private apby() {
        this.e = 2;
        emptyProtobufList();
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
                if ((b2 = apby.b) == null) {
                    synchronized (apby.class) {
                        if (apby.b == null) {
                            apby.b = (ahbe)new agzb((agzi)apby.a);
                        }
                    }
                }
                return b2;
            }
            case 5: {
                return apby.a;
            }
            case 4: {
                return new agza((agzi)apby.a);
            }
            case 3: {
                return new apby();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)apby.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u1409\u0000", new Object[] { "c", "d" });
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
