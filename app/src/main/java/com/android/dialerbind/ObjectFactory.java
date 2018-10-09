/*
 * Copyright (C) 2013 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License
 */

package com.android.dialerbind;

import android.content.Context;

import com.android.dialer2.calllog.CallLogAdapter;
import com.android.dialer2.calllog.ContactInfoHelper;
import com.android.dialer2.service.CachedNumberLookupService;
import com.android.dialer2.voicemail.VoicemailPlaybackPresenter;

import static com.android.dialer2.calllog.CallLogAdapter.CallFetcher;

/**
 * Default static binding for various objects.
 */
public class ObjectFactory {

    public static CachedNumberLookupService newCachedNumberLookupService() {
        // no-op
        return null;
    }

    /**
     * Create a new instance of the call log adapter.
     * @param context The context to use.
     * @param callFetcher Instance of call fetcher to use.
     * @param contactInfoHelper Instance of contact info helper class to use.
     * @return Instance of CallLogAdapter.
     */
    public static CallLogAdapter newCallLogAdapter(
            Context context,
            CallFetcher callFetcher,
            ContactInfoHelper contactInfoHelper,
            VoicemailPlaybackPresenter voicemailPlaybackPresenter,
            boolean isShowingRecentsTab) {
        return new CallLogAdapter(
                context,
                callFetcher,
                contactInfoHelper,
                voicemailPlaybackPresenter,
                isShowingRecentsTab);
    }
}
