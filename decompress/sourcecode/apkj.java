import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apkj extends agzi implements ahax
{
    public static final apkj a;
    private static volatile ahbe d;
    public int b;
    public String c;
    
    static {
        agzi.registerDefaultInstance(apkj.class, a = new apkj());
    }
    
    private apkj() {
        this.c = "";
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe d;
                if ((d = apkj.d) == null) {
                    synchronized (apkj.class) {
                        if (apkj.d == null) {
                            apkj.d = (ahbe)new agzb((agzi)apkj.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return apkj.a;
            }
            case 4: {
                return new agza((agzi)apkj.a);
            }
            case 3: {
                return new apkj();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)apkj.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1008\u0000", new Object[] { "b", "c" });
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
