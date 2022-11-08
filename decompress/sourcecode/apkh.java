import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apkh extends agzi implements ahax
{
    public static final apkh a;
    private static volatile ahbe d;
    public int b;
    public String c;
    
    static {
        agzi.registerDefaultInstance(apkh.class, a = new apkh());
    }
    
    private apkh() {
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
                if ((d = apkh.d) == null) {
                    synchronized (apkh.class) {
                        if (apkh.d == null) {
                            apkh.d = (ahbe)new agzb((agzi)apkh.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return apkh.a;
            }
            case 4: {
                return new agza((agzi)apkh.a);
            }
            case 3: {
                return new apkh();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)apkh.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1008\u0000", new Object[] { "b", "c" });
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
