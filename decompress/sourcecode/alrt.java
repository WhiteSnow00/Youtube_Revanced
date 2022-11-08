import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alrt extends agzi implements ahax
{
    public static final alrt a;
    private static volatile ahbe b;
    private byte c;
    
    static {
        agzi.registerDefaultInstance(alrt.class, a = new alrt());
    }
    
    private alrt() {
        this.c = 2;
        emptyProtobufList();
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
                if ((b = alrt.b) == null) {
                    synchronized (alrt.class) {
                        if (alrt.b == null) {
                            alrt.b = (ahbe)new agzb((agzi)alrt.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return alrt.a;
            }
            case 4: {
                return new agza((agzi)alrt.a);
            }
            case 3: {
                return new alrt();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)alrt.a, "\u0001\u0000", null);
            }
            case 1: {
                this.c = (byte)((o != null) ? 1 : 0);
                return null;
            }
            case 0: {
                return this.c;
            }
        }
    }
}
