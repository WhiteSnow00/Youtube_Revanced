import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apkk extends agzi implements ahax
{
    public static final apkk a;
    private static volatile ahbe b;
    
    static {
        agzi.registerDefaultInstance(apkk.class, a = new apkk());
    }
    
    private apkk() {
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
                if ((b = apkk.b) == null) {
                    synchronized (apkk.class) {
                        if (apkk.b == null) {
                            apkk.b = (ahbe)new agzb((agzi)apkk.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return apkk.a;
            }
            case 4: {
                return new agza((agzi)apkk.a);
            }
            case 3: {
                return new apkk();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)apkk.a, "\u0001\u0000", null);
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
