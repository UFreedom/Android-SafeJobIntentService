# Android-SafeJobIntentService

When use Android JobIntentService(support-v4),May be you face crash issue.

Even you use [android-job][1] before 1.3.0-alpha04.But [android-job][1] has fix the issue in 1.3.0-alpha04, 

This code  was copy from [android-job][1].If you don't use [android-job][1] but want to solve the problem,You can use this repo
 
Usage
-----
Add dependencies in build.gradle.

```groovy
    dependencies {
        compile 'com.ufreedom.kit:safejobintentservice:1.0.1'
    }

```



Crash Log
----- 
 1.
 ```java
 
Caused by java.lang.IllegalArgumentException: Given work is not active: JobWorkItem{id=1 intent=Intent {  } dcount=1}
       at android.app.job.JobParameters.completeWork(JobParameters.java:221)
       at android.support.v4.app.JobIntentService$JobServiceEngineImpl$WrapperWorkItem.complete(SourceFile:267)
       at android.support.v4.app.JobIntentService$CommandProcessor.doInBackground(SourceFile:393)
       at android.support.v4.app.JobIntentService$CommandProcessor.doInBackground(SourceFile:382)
       at android.os.AsyncTask$2.call(AsyncTask.java:333)
       at java.util.concurrent.FutureTask.run(FutureTask.java:266)
       at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1162)
       at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:636)
       at java.lang.Thread.run(Thread.java:764)


```

2.

```java

Caused by java.lang.SecurityException: Caller no longer running, last stopped +43s420ms because: timed out while starting
       at android.os.Parcel.readException(Parcel.java:2005)
       at android.os.Parcel.readException(Parcel.java:1951)
       at android.app.job.IJobCallback$Stub$Proxy.dequeueWork(IJobCallback.java:191)
       at android.app.job.JobParameters.dequeueWork(JobParameters.java:208)
       at android.support.v4.app.JobIntentService$JobServiceEngineImpl.dequeueWork(SourceFile:314)
       at android.support.v4.app.JobIntentService.dequeueWork(SourceFile:639)
       at android.support.v4.app.JobIntentService$CommandProcessor.doInBackground(SourceFile:389)
       at android.support.v4.app.JobIntentService$CommandProcessor.doInBackground(SourceFile:382)
       at android.os.AsyncTask$2.call(AsyncTask.java:333)
       at java.util.concurrent.FutureTask.run(FutureTask.java:266)
       at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1162)
       at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:636)
       at java.lang.Thread.run(Thread.java:764)



```


Discuss
--------
- issue in [android-job][1]: https://github.com/evernote/android-job/issues/255

- Google Issue Tracker : https://issuetracker.google.com/issues/63622293


License 
--------

    Copyright 2018 UFreedom

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
    
    
    
[1]:https://github.com/evernote/android-job
