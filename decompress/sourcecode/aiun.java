import com.google.protobuf.MessageLite;
import com.google.protos.youtube.elements.CommandOuterClass$Command;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aiun extends agzi implements ahax
{
    public static final aiun a;
    public static final agzg b;
    private static volatile ahbe i;
    public int c;
    public int d;
    public Object e;
    public String f;
    public boolean g;
    public boolean h;
    
    static {
        final aiun a2 = new aiun();
        agzi.registerDefaultInstance(aiun.class, a = a2);
        b = agzi.newSingularGeneratedExtension((MessageLite)CommandOuterClass$Command.getDefaultInstance(), a2, (MessageLite)a2, null, 343298030, ahcm.k, aiun.class);
    }
    
    private aiun() {
        this.d = 0;
        this.f = "";
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe i;
                if ((i = aiun.i) == null) {
                    synchronized (aiun.class) {
                        if (aiun.i == null) {
                            aiun.i = (ahbe)new agzb((agzi)aiun.a);
                        }
                    }
                }
                return i;
            }
            case 5: {
                return aiun.a;
            }
            case 4: {
                return new agza((agzi)aiun.a);
            }
            case 3: {
                return new aiun();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aiun.a, "\u0001\u0005\u0001\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001\u1036\u0000\u0002\u1008\u0002\u0003\u1007\u0003\u0004\u1007\u0004\u0005\u103c\u0000", new Object[] { "e", "d", "c", "f", "g", "h", ajag.class });
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
