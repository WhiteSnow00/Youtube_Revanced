import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apkf extends agzi implements ahax
{
    public static final apkf a;
    private static volatile ahbe b;
    
    static {
        agzi.registerDefaultInstance(apkf.class, a = new apkf());
    }
    
    private apkf() {
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe b;
                if ((b = apkf.b) == null) {
                    synchronized (apkf.class) {
                        if (apkf.b == null) {
                            apkf.b = (ahbe)new agzb((agzi)apkf.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return apkf.a;
            }
            case 4: {
                return new agza((agzi)apkf.a);
            }
            case 3: {
                return new apkf();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)apkf.a, "\u0001\u0000", null);
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
