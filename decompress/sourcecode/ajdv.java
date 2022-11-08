import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajdv extends agzi implements ahax
{
    public static final ajdv a;
    public static final agzg b;
    private static volatile ahbe h;
    public int c;
    public ajdu d;
    public ajea e;
    public aqcz f;
    public String g;
    private aqbw i;
    private byte j;
    
    static {
        final ajdv a2 = new ajdv();
        agzi.registerDefaultInstance(ajdv.class, a = a2);
        b = agzi.newSingularGeneratedExtension((MessageLite)aqcu.a, a2, (MessageLite)a2, null, 372095937, ahcm.k, ajdv.class);
    }
    
    private ajdv() {
        this.j = 2;
        this.g = "";
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
                final ahbe h;
                if ((h = ajdv.h) == null) {
                    synchronized (ajdv.class) {
                        if (ajdv.h == null) {
                            ajdv.h = (ahbe)new agzb((agzi)ajdv.a);
                        }
                    }
                }
                return h;
            }
            case 5: {
                return ajdv.a;
            }
            case 4: {
                return new agza((agzi)ajdv.a);
            }
            case 3: {
                return new ajdv();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ajdv.a, "\u0001\u0005\u0000\u0001\u0001\u0007\u0005\u0000\u0000\u0001\u0001\u1009\u0000\u0002\u1009\u0001\u0004\u1409\u0003\u0005\u1009\u0004\u0007\u1008\u0006", new Object[] { "c", "d", "e", "f", "i", "g" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.j = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.j;
            }
        }
    }
}
