import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aisg extends ahcz implements aheo
{
    public static final aisg a;
    private static volatile ahev h;
    public int b;
    public aisc c;
    public aisc d;
    public apve e;
    public ahbt f;
    public ahdp g;
    private ahjl i;
    private byte j;
    
    static {
        ahcz.registerDefaultInstance(aisg.class, a = new aisg());
    }
    
    private aisg() {
        this.j = 2;
        this.f = ahbt.b;
        this.g = ahcz.emptyProtobufList();
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte j = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev h;
                if ((h = aisg.h) == null) {
                    synchronized (aisg.class) {
                        if (aisg.h == null) {
                            aisg.h = (ahev)new ahcs((ahcz)aisg.a);
                        }
                    }
                }
                return h;
            }
            case 5: {
                return aisg.a;
            }
            case 4: {
                return new ahcr((ahcz)aisg.a);
            }
            case 3: {
                return new aisg();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aisg.a, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0001\u0003\u0001\u1409\u0000\u0002\u1409\u0001\u0004\u1009\u0003\u0005\u1409\u0004\u0006\u100a\u0005\u0007\u001b", new Object[] { "b", "c", "d", "e", "i", "f", "g", ainq.class });
            }
            case 1: {
                if (o == null) {
                    j = 0;
                }
                this.j = j;
                return null;
            }
            case 0: {
                return this.j;
            }
        }
    }
}
