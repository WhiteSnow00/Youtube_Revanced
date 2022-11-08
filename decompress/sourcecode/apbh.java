import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apbh extends agzi implements ahax
{
    public static final apbh a;
    private static volatile ahbe b;
    private int c;
    private apbd d;
    private byte e;
    
    static {
        agzi.registerDefaultInstance(apbh.class, a = new apbh());
    }
    
    private apbh() {
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
                if ((b2 = apbh.b) == null) {
                    synchronized (apbh.class) {
                        if (apbh.b == null) {
                            apbh.b = (ahbe)new agzb((agzi)apbh.a);
                        }
                    }
                }
                return b2;
            }
            case 5: {
                return apbh.a;
            }
            case 4: {
                return new agza((agzi)apbh.a);
            }
            case 3: {
                return new apbh();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)apbh.a, "\u0001\u0001\u0000\u0001\ue8f8\u3bd7\ue8f8\u3bd7\u0001\u0000\u0000\u0001\ue8f8\u3bd7\u1409\u0000", new Object[] { "c", "d" });
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
