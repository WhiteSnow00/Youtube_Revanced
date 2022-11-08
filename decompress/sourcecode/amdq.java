// 
// Decompiled by Procyon v0.6.0
// 

public enum amdq implements agzm
{
    a("MEDIA_ENGINE_ERROR_TYPE_UNKNOWN", 0, 0), 
    b("MEDIA_ENGINE_ERROR_TYPE_SET_EFFECT_FAILED", 1, 1), 
    c("MEDIA_ENGINE_ERROR_TYPE_IO", 2, 2), 
    d("MEDIA_ENGINE_ERROR_TYPE_MISSING_INPUT_ARGUMENT", 3, 7), 
    e("MEDIA_ENGINE_ERROR_TYPE_INVALID_INPUT_ARGUMENT", 4, 8), 
    f("MEDIA_ENGINE_ERROR_TYPE_FAILED_PRECONDITION", 5, 25), 
    g("MEDIA_ENGINE_ERROR_TYPE_AUDIO_PLAYBACK_INTERNAL", 6, 3), 
    h("MEDIA_ENGINE_ERROR_TYPE_AUDIO_PLAYER_INIT", 7, 4), 
    i("MEDIA_ENGINE_ERROR_TYPE_AUDIO_TRACK_INIT", 8, 5), 
    j("MEDIA_ENGINE_ERROR_TYPE_AUDIO_RESAMPLER_INIT", 9, 9), 
    k("MEDIA_ENGINE_ERROR_TYPE_AUDIO_DECODER_INIT", 10, 10), 
    l("MEDIA_ENGINE_ERROR_TYPE_AUDIO_DECODER_CANCELED", 11, 11), 
    m("MEDIA_ENGINE_ERROR_TYPE_AUDIO_DECODER_FAILED", 12, 6), 
    n("MEDIA_ENGINE_ERROR_TYPE_AUDIO_MIXING_INVALID_OUTPUT_SIZE", 13, 12), 
    o("MEDIA_ENGINE_ERROR_TYPE_AUDIO_MIXING_INPUT_NOT_INITIALIZED", 14, 13), 
    p("MEDIA_ENGINE_ERROR_TYPE_AUDIO_MIXING_INVALID_GAIN", 15, 14), 
    q("MEDIA_ENGINE_ERROR_TYPE_AUDIO_MIXING_INPUT_MISMATCH", 16, 15), 
    r("MEDIA_ENGINE_ERROR_TYPE_AUDIO_STREAM_INIT", 17, 16), 
    s("MEDIA_ENGINE_ERROR_TYPE_AUDIO_STREAM_OPEN", 18, 17), 
    t("MEDIA_ENGINE_ERROR_TYPE_AUDIO_STREAM_CLOSE", 19, 18), 
    u("MEDIA_ENGINE_ERROR_TYPE_AUDIO_STREAM_PLAY", 20, 19), 
    v("MEDIA_ENGINE_ERROR_TYPE_AUDIO_STREAM_PAUSE", 21, 20), 
    w("MEDIA_ENGINE_ERROR_TYPE_AUDIO_FORMAT_MIME", 22, 21), 
    x("MEDIA_ENGINE_ERROR_TYPE_AUDIO_FORMAT_CHANNEL_COUNT", 23, 22), 
    y("MEDIA_ENGINE_ERROR_TYPE_AUDIO_FORMAT_SAMPLE_RATE", 24, 23), 
    z("MEDIA_ENGINE_ERROR_TYPE_AUDIO_FORMAT_CHANGED_DURING_PLAYBACK", 25, 24);
    
    public final int A;
    
    private amdq(final String s, final int n, final int a) {
        this.A = a;
    }
    
    public static agzo a() {
        return amcq.j;
    }
    
    public static amdq b(final int n) {
        switch (n) {
            default: {
                return null;
            }
            case 25: {
                return amdq.f;
            }
            case 24: {
                return amdq.z;
            }
            case 23: {
                return amdq.y;
            }
            case 22: {
                return amdq.x;
            }
            case 21: {
                return amdq.w;
            }
            case 20: {
                return amdq.v;
            }
            case 19: {
                return amdq.u;
            }
            case 18: {
                return amdq.t;
            }
            case 17: {
                return amdq.s;
            }
            case 16: {
                return amdq.r;
            }
            case 15: {
                return amdq.q;
            }
            case 14: {
                return amdq.p;
            }
            case 13: {
                return amdq.o;
            }
            case 12: {
                return amdq.n;
            }
            case 11: {
                return amdq.l;
            }
            case 10: {
                return amdq.k;
            }
            case 9: {
                return amdq.j;
            }
            case 8: {
                return amdq.e;
            }
            case 7: {
                return amdq.d;
            }
            case 6: {
                return amdq.m;
            }
            case 5: {
                return amdq.i;
            }
            case 4: {
                return amdq.h;
            }
            case 3: {
                return amdq.g;
            }
            case 2: {
                return amdq.c;
            }
            case 1: {
                return amdq.b;
            }
            case 0: {
                return amdq.a;
            }
        }
    }
    
    @Override
    public final int getNumber() {
        return this.A;
    }
    
    @Override
    public final String toString() {
        return Integer.toString(this.A);
    }
}
