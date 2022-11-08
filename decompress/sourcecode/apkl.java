import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apkl extends agzi implements ahax
{
    public static final apkl a;
    private static volatile ahbe g;
    public int b;
    public int c;
    public Object d;
    public int e;
    public agzy f;
    
    static {
        agzi.registerDefaultInstance(apkl.class, a = new apkl());
    }
    
    private apkl() {
        this.c = 0;
        this.f = agzi.emptyProtobufList();
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe g;
                if ((g = apkl.g) == null) {
                    synchronized (apkl.class) {
                        if (apkl.g == null) {
                            apkl.g = (ahbe)new agzb((agzi)apkl.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return apkl.a;
            }
            case 4: {
                return new agza((byte[][][])null, (short[][][])null);
            }
            case 3: {
                return new apkl();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)apkl.a, "\u0001\u0005\u0001\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001\u100c\u0000\u0002\u001b\u0003\u103c\u0000\u0004\u103c\u0000\u0005\u103c\u0000", new Object[] { "d", "c", "b", "e", apjd.l, "f", apki.class, apkh.class, apkj.class, apkk.class });
            }
            case 1: {
                return null;
            }
            case 0: {
                return 1;
            }
        }
    }
}
