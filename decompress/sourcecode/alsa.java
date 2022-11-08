import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alsa extends agzi implements ahax
{
    public static final alsa a;
    private static volatile ahbe b;
    private byte c;
    
    static {
        agzi.registerDefaultInstance(alsa.class, a = new alsa());
    }
    
    private alsa() {
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
                if ((b = alsa.b) == null) {
                    synchronized (alsa.class) {
                        if (alsa.b == null) {
                            alsa.b = (ahbe)new agzb((agzi)alsa.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return alsa.a;
            }
            case 4: {
                return new agza((agzi)alsa.a);
            }
            case 3: {
                return new alsa();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)alsa.a, "\u0001\u0000", null);
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
